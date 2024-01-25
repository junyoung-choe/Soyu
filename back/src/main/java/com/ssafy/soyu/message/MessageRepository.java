package com.ssafy.soyu.message;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MessageRepository extends JpaRepository<Message, Long> {

  @EntityGraph
  @Query("select m from Message m where m.chat.id = :chatId")
  List<Message> findMessagesByChatId(@Param("chatId") Long chatId);
}
