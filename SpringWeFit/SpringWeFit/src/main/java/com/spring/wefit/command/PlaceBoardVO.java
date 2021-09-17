package com.spring.wefit.command;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 CREATE TABLE PlaceBoard
(
    pbNum            NUMBER(10, 0)     NOT NULL, 
    memberNum        NUMBER(20, 0)     NOT NULL, 
    pbCategory       VARCHAR(20)      NOT NULL, 
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
    pbAddrBasic      VARCHAR(300)      NOT NULL, 
    pbLatitude       NUMBER(9, 6)      NOT NULL, 
    pbLongitude      NUMBER(9, 6)      NOT NULL, 
    pbLookCount      NUMBER(20,0)      DEFAULT 0 NOT NULL, 
    pbImageCount     NUMBER(2,0)       NOT NULL, 
    pbRegDate        DATE              DEFAULT SYSDATE NOT NULL, 
    CONSTRAINT PK_PlaceBoard PRIMARY KEY (pbNum)
);

ALTER TABLE PlaceBoard 
	ADD pbAddrDetail VARCHAR(300) NOT NULL;

CREATE SEQUENCE placeBoard_seq 
    START WITH 1 
    INCREMENT BY 1 
    MAXVALUE 10000000 
    NOCYCLE 
    NOCACHE;
    
ALTER TABLE PlaceBoard 
	Rename column mNum To memberNum;
ALTER TABLE PlaceReply 
	Rename column mNum To memberNum;
ALTER TABLE PlaceLikely 
	Rename column mNum To memberNum;
ALTER TABLE PlaceReport 
	Rename column mNum To memberNum;

ALTER TABLE PlaceBoard 
	modify pbImageCount null;
ALTER TABLE PlaceBoard 
	MODIFY pbLookCount NULL;
ALTER TABLE PlaceBoard 
	MODIFY pbImageCount NULL;
ALTER TABLE PlaceBoard 
	MODIFY pbImageCount DEFAULT 0;
	
ALTER TABLE PlaceBoard 
	modify pbCategory DEFAULT 0;
	
ALTER TABLE PlaceBoard 
	modify pbAddrBasic, pbAddrDetail, 
	pbLatitude, pbLongitude, pbImageCount  DEFAULT 0;
	
 */


@Getter
@Setter
@ToString
public class PlaceBoardVO {
	
	private int pbNum;
	private String memberNum;
	private String pbCategory;
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
	private String pbAddrBasic;
	private String pbAddrDetail;
	private double pbLatitude;
	private double pbLongitude;
	private int pbLookCount;
	private int pbImageCount;
	private Timestamp pbRegDate;
//	private boolean isNewMark;

}
