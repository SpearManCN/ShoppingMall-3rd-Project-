package shop.reository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import shop.domain.BasketDTO;
import shop.domain.JoinDTO;
import shop.mapper.LoginMapper;

import java.util.List;

@Repository
public class LoginRepositoryV1 implements LoginRepository{
    @Autowired
    LoginMapper loginMapper;
    @Override
    public int insertMember(JoinDTO joinDTO){
        return loginMapper.join(joinDTO);
    }

    @Override
    public JoinDTO selectMember(JoinDTO joinDTO){ return loginMapper.selectMember(joinDTO);}

    @Override
    public void updateMember(JoinDTO joinDTO){loginMapper.updateMember(joinDTO);}
    @Override
    public List<BasketDTO> selectBasket(JoinDTO joinDTO){return loginMapper.selectBasket(joinDTO);}

}
