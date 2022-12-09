package com.example.board;

import com.example.board.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertBoard(BoardVO vo) {
        int result = sqlSession.insert("BOARD.insertBoard", vo);
        return result;
    }

    public int deleteBoard(int seq) {
        int result = sqlSession.delete("BOARD.deleteBoard", seq);
        return result;
    }

    public int updateBoard(BoardVO vo) {
        int result = sqlSession.update("BOARD.updateBoard", vo);
        return result;
    }

    public BoardVO getBoard(int seq) {
        BoardVO one = sqlSession.selectOne("BOARD.getBoard", seq);
        return one;
    }

    public List<BoardVO> getBoardList() {
        List<BoardVO> list = sqlSession.selectList("BOARD.getBoardList");
        return list;
    }
}