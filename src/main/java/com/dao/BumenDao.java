package com.dao;

import com.entity.BumenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BumenVO;
import com.entity.view.BumenView;


/**
 * 部门
 * 
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface BumenDao extends BaseMapper<BumenEntity> {
	
	List<BumenVO> selectListVO(@Param("ew") Wrapper<BumenEntity> wrapper);
	
	BumenVO selectVO(@Param("ew") Wrapper<BumenEntity> wrapper);
	
	List<BumenView> selectListView(@Param("ew") Wrapper<BumenEntity> wrapper);

	List<BumenView> selectListView(Pagination page,@Param("ew") Wrapper<BumenEntity> wrapper);
	
	BumenView selectView(@Param("ew") Wrapper<BumenEntity> wrapper);
	
}
