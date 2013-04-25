package org.woehlke.spring.cache.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.woehlke.spring.cache.model.ApiSource;
import org.woehlke.spring.cache.model.TweetCached;

public interface TweetRepository extends JpaRepository<TweetCached,Long> {

	TweetCached findByTwitterIdAndTwitterApiSource(long twitterId,ApiSource twitterApiSource);
	Page<TweetCached> findByTwitterApiSourceOrderByCreatedAtDesc(ApiSource twitterApiSource, Pageable pageable);
	Page<TweetCached> findByFromUserId(long fromUserId,Pageable pageable);
}
