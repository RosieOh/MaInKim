package kr.co.mainkim.service;

import kr.co.mainkim.dto.Board;

import java.util.List;

public interface BoardService {
    public List<Board> boardList() throws Exception;
    public Board boardDetail(int seq) throws Exception;
    public void boardInsert(Board dto) throws Exception;
    public void boardDelete(int seq) throws Exception;
    public void boardEdit(Board dto) throws Exception;
}