package com.zp.Server.Dao;

import com.zp.Server.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountDao {
	/**
	 * 通过推特账号获取该推特账号所有信息
	 * @param Account_Num 推特的ID
	 * @return
	 * @throws LoginSQLException
	 */
	public Account getAccountByID(@Param("AccountNum") String AccountNum);
	/**
	 * 获取所有推特账号
	 * @return
	 */
	public List<Account> getAccountAll();
	/**
	 * 通过推特的状态获取多个推特
	 * @param State
	 * @return
	 */
	public List<Account> getAccountByState(@Param("State") String State);

	/**
	 * 修改推特账号
	 * @param account
	 */
	public int ModifyAccount(Account account);

	/**
	 * 通过推特账号删除该推特
	 * @param Account_Num
	 * @return
	 */
//	public int deleteAccount(@Param("AccountNum") String AccountNum);
	/**
	 * 随机获取指定的推特数
	 * @param state 状态
	 * @param num  个数
	 * @return
	 */
	public List<Account> getAccountByStateRand(@Param("uid") String uid, @Param("state") String state, @Param("num") int num);
	/**
	 * 修改指定推特的状态State
	 * @param AccountNum 指定的推特账号
	 * @param State		要修改的状态
	 * @return
	 */
	public int modifyAccountState(@Param("AccountNum") String AccountNum, @Param("State") String State);

	/**
	 * 通过状态获取推特的数量
	 * @param state 推特的状态
	 * @return
	 */
	public Object getAccountNumsByState(@Param("state") String state);

	/**
	 * 通过指定用户和推特状态获取推特数量
	 * @param state  推特状态
	 * @param uid    使用的用户ID
	 * @return
	 */
	public Object getAccountNumsBy_S_U(@Param("state") String state, @Param("uid") String uid);
	/**
	 * 通过指定用户和推特状态和推特类型获取推特数量
	 * @param state 推特状态
	 * @param uid  用户id
	 * @param type 推特类型
	 * @return
	 */
	public Object getAccountNumsBy_S_U_T(@Param("state") String state, @Param("uid") String uid, @Param("type") String type);
	/**
	 *
	 * @param userId
	 * @param accountNum
	 * @return
	 */
	public int addUserIDforTwtter(@Param("userId") String userId, @Param("accountNum") String accountNum);

	/**
	 * 通过指定用户和推特状态获取推特信息表
	 * @param uid
	 * @param state
	 * @return
	 */
	public List<Account> getAccountAll_By_U_S(@Param("uid") String uid, @Param("state") String state);
	/**
	 * 通过指定用户和推特类型获取推特信息表
	 * @param uid
	 * @param type
	 * @return
	 */
	public Object getAccountNumsByType_U(@Param("uid") String uid, @Param("type") String type);

	/**
	 * 修改推特信息表使用状态
	 * @param accountNum
	 * @param useState
	 * @return
	 */
	public int modifyAccountUseState(@Param("accountNum") String accountNum, @Param("useState") String useState);

	/**
	 * 导入推特表时，同时插入推特信息数据
	 * @param account
	 * @return
	 */
	public int InsertupdateAccount(Account account);
	/**
	 * 设置推特UserID为空
	 * @param tid 推特ID
	 * @return
	 */
	public int deleteTwtterUIDBy_Tid(String tid);


}
