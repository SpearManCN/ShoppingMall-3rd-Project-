package shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.domain.BoardDTO;
import shop.reository.BoardRepository;

@Service
public class BoardServiceV1 implements BoardService{
    @Autowired
    BoardRepository boardRepository;
    @Override
    public void insertBoard(BoardDTO boardDTO){
        boardRepository.insertBoard(boardDTO);
    }
}