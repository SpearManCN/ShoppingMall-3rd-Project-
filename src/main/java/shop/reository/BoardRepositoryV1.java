package shop.reository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import shop.mapper.BoardMapper;
import shop.domain.BoardDTO;

import java.util.List;

@Repository
public class BoardRepositoryV1 implements BoardRepository {
    @Autowired
    BoardMapper boardMapper;
    @Override
    public void insertBoard(BoardDTO boardDTO){
        boardMapper.insertBoard(boardDTO);
    }
    @Override
    public List selectAllBoard(){
        return boardMapper.selectAllBoard();
    }

    @Override
    public BoardDTO selectOneBoard(BoardDTO boardDTO){return boardMapper.selectOneBoard(boardDTO);}
}
