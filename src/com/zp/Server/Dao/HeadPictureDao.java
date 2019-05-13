package com.zp.Server.Dao;

import java.util.Date;
import java.util.List;

import com.zp.Server.model.HeadPicture;
import org.apache.ibatis.annotations.Param;

public interface HeadPictureDao {

	/**
	 * @param
	 * @return
	 */
	List<HeadPicture> getHeadPicture();

	/**
	 * @param Owner
	 * @param Insert_time
	 * @return
	 */
	int addOwnerByNickname(@Param("Owner")String Owner, @Param("Insert_time")Date Insert_time, @Param("Nickname")String Nickname);

	/**
	 * @param nickname
	 * @return
	 */
	int delOwnerByNickname(@Param("nickname")String nickname);

	int addpic(HeadPicture hp);
}
