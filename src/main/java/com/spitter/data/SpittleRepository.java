package com.spitter.data;

import java.util.List;
import com.spitter.entity.Spittle;

public interface SpittleRepository {
	List <Spittle> findSpittles(long max, int count);
}
