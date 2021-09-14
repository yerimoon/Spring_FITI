package com.spring.wefit.command;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 CREATE TABLE PlaceBoard
(
    pbNum            NUMBER(10, 0)     NOT NULL, 
    mNum            NUMBER(20, 0)     NOT NULL, 
    pbTitle          VARCHAR2(200)     NOT NULL, 
    pbContent        VARCHAR2(2000), 
    pbImage1         VARCHAR2(50)  , 
    pbImage2         VARCHAR2(50)  , 
    pbImage3         VARCHAR2(50)  , 
    pbImage4         VARCHAR2(50)  , 
    pbImage5         VARCHAR2(50)  , 
    pbRealImage1     VARCHAR2(50)  , 
    pbRealImage2     VARCHAR2(50)  , 
    pbRealImage3     VARCHAR2(50)  , 
    pbRealImage4     VARCHAR2(50)  , 
    pbRealImage5     VARCHAR2(50)  , 
    pbCategory      VARCHAR(20)      NOT NULL, 
    pbAddrBasic      VARCHAR(300)      NOT NULL, 
    pbLatitude       NUMBER(9, 6)      NOT NULL, 
    pbLongitude      NUMBER(9, 6)      NOT NULL, 
    pbLookCount      NUMBER(20,0)      DEFAULT 0 NOT NULL, 
    pbImageCount     NUMBER(2,0)       NOT NULL, 
    pbRegDate        DATE              DEFAULT SYSDATE NOT NULL, 
    CONSTRAINT PK_PlaceBoard PRIMARY KEY (pbNum)
);

 */


@Getter
@Setter
@ToString
public class PlaceBoardVO {
	
	private int pbNum;
	private String mNum;
	private String pbTitle;
	private String pbContent;
	private String pbImage1;
	private String pbImage2;
	private String pbImage3;
	private String pbImage4;
	private String pbImage5;
	private String pbRealImage1;
	private String pbRealImage2;
	private String pbRealImage3;
	private String pbRealImage4;
	private String pbRealImage5;
	private String pbCategory;
	private String pbAddrBasic;
	private double pbLatitude;
	private double pbLongitude;
	private int pbLookCount;
	private int pbImageCount;
	private Timestamp pbRegDate;
	
	//private boolean isNewMark;

}
