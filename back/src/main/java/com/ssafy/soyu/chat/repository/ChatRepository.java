package com.ssafy.soyu.chat.repository;

import com.ssafy.soyu.chat.Chat;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ChatRepository extends JpaRepository<Chat, Long> {

  @Query("select c from Chat c where c.buyer.id = :userId or c.seller.id = :userId")
  List<Chat> findChatByUserId(@Param("userId") Long userId);

  Chat findChatById(Long chatId);

}