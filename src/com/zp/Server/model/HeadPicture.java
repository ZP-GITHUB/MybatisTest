package com.zp.Server.model;

import java.util.Date;

public class HeadPicture {

	private int Id;
	private String Nickname;
	private String PictureLink;
	private String Owner;
	private Date insertTime;

	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	public String getPictureLink() {
		return PictureLink;
	}
	public void setPictureLink(String pictureLink) {
		PictureLink = pictureLink;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public Date getInsert_time() {
		return insertTime;
	}
	public void setInsert_time(Date insertTime) {
		insertTime = insertTime;
	}
	@Override
	public String toString() {
		return "HeadPicture [Nickname=" + Nickname + ", PictureLink=" + PictureLink + ", Owner=" + Owner
				+ ", Insert_time=" + insertTime + "]";
	}
	public HeadPicture(String nickname, String pictureLink, String owner, Date insertTime) {
		super();
		Nickname = nickname;
		PictureLink = pictureLink;
		Owner = owner;
		insertTime = insertTime;
	}

	public HeadPicture() {
		super();
	}
	
}
