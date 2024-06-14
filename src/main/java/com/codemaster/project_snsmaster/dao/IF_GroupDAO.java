package com.codemaster.project_snsmaster.dao;

import com.codemaster.project_snsmaster.vo.*;

import java.util.List;

public interface IF_GroupDAO {
    public void insert(GroupPostVO gpvo) throws Exception;

    public void gjinsert(G_joinVO gjvo) throws Exception;

    public void mginsert(MemberGroupVO mgvo) throws Exception;

    public List<MemberGroupVO> selectAll() throws Exception;

    public int joinsert(GroupJoinVO gjvo) throws Exception;

    public int gjminsert(GroupJoinVO gjvo) throws Exception;

    public int gmjinsert(G_memberVO gmvo) throws Exception;

    public List<GroupPostVO> gpselectAll(String gno) throws Exception;

    public List<G_joinVO> gjselectAll(String gno) throws Exception;

    public List<GroupJoinVO> gjoselectAll(String gno) throws Exception;

    public void delete(int g_no) throws Exception;

    public void gjdelete(int mo_no) throws Exception;

    public void mdelete(int gno) throws Exception;


    public GroupPostVO modno(int g_no) throws Exception;

    public G_joinVO gmjoinmod(int moNo) throws Exception;

    public void modupdate(GroupPostVO gpvo) throws Exception;

    public void gmjoinupdate(G_joinVO gjvo) throws Exception;

    GroupPostVO gposelect(String g_no) throws Exception;

    public void gcinsert(GroupPostCommentVO gcvo) throws Exception;

    public List<GroupPostCommentVO> cmselectAll(String g_no) throws Exception;

    public void cmdelete(int c_no) throws Exception;

    public void gjmdelete(GroupJoinVO gjvo) throws Exception;

    public void dgjmdelete(int wait_no) throws Exception;


    // public int countselect(int mo_no) throws Exception;
}
