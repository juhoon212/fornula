package com.fornula.domain.expert.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fornula.domain.expert.dto.Expert;
import com.fornula.domain.expert.mapper.java.ExpertInputMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExpertInputDAOImpl implements ExpertInputDAO {
    private final SqlSession sqlSession;
    private final ExpertInputMapper expertInputMapper;
    
    @Override
    public void updateExpert(Expert expert) {
    	sqlSession.getMapper(ExpertInputMapper.class).updateExpert(expert);
    }

    @Override
    public Expert selectOriginalExpert(int expertIdx) {
        return sqlSession.getMapper(ExpertInputMapper.class).selectOriginalExpert(expertIdx);
    }
}