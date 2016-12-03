package ch.trial.address.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * 
 * @author Administrator
 *
 */

public class Thumbs {
	private StringProperty  vocabulary;
	private IntegerProperty baiduThumbs;
	private IntegerProperty youdaoThumbs;
	private IntegerProperty beingThumbs;
	
	public Thumbs(){
		this.vocabulary = new SimpleStringProperty(null);
		this.baiduThumbs = new SimpleIntegerProperty(0) ;
		this.youdaoThumbs = new SimpleIntegerProperty(0) ;
		this.beingThumbs = new SimpleIntegerProperty(0) ;
	}
	
	public Thumbs(String word, int baiduThumbs, int youdaoThumbs, int beingThumbs ){
		this.vocabulary = new SimpleStringProperty(word);
		this.baiduThumbs = new SimpleIntegerProperty(baiduThumbs) ;
		this.youdaoThumbs = new SimpleIntegerProperty(youdaoThumbs) ;
		this.beingThumbs = new SimpleIntegerProperty(beingThumbs) ;
	}
	
	public String getWord(){
		return vocabulary.get();
	}
	
	public int getBaiduThumbs(){
		return baiduThumbs.get();
	}

	public int getYoudaoThumbs(){
		return youdaoThumbs.get();
	}

	public int getBeingThumbs(){
		return beingThumbs.get();
	}

	public void setBaiduThumbs(int num){
		this.baiduThumbs = new SimpleIntegerProperty(num);
	}

	public void setYoudaoThumbs(int num){
		this.youdaoThumbs = new SimpleIntegerProperty(num);
	}

	public void setBeingThumbs(int num){
		this.beingThumbs = new SimpleIntegerProperty(num);
	}
	
	public void addBaiduThumbs(){
		this.setBaiduThumbs(this.getBaiduThumbs() + 1);
	}
	
	public void addYoudaoThumbs(){
		this.setYoudaoThumbs(this.getYoudaoThumbs() + 1);
	}
	
	public void addBeingThumbs(){
		this.setBeingThumbs(this.getBeingThumbs() + 1);
	}
}
