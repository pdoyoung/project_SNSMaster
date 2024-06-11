package com.codemaster.project_snsmaster.dao;

import com.codemaster.project_snsmaster.vo.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAOImpl implements IF_AdminDAO{
    private static String mapperquery="com.codemaster.project_snsmaster.dao.IF_AdminDAO";

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void insert(MemberVO memberVO) throws Exception{
        sqlSession.insert(mapperquery+".insert", memberVO);
    }

    @Override
    public int overlappedID(String id) throws Exception {
        return sqlSession.selectOne(mapperquery+".overlappedID" ,id);
    }

    @Override
    public int overlappedEmail(String email) throws Exception {
        return sqlSession.selectOne(mapperquery+".overlappedEmail" ,email);
    }
}
