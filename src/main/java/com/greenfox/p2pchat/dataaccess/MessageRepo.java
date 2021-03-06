package com.greenfox.p2pchat.dataaccess;

import com.greenfox.p2pchat.model.Message;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by peter on 2017.05.17..
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

  List<Message> findAllByOrderByTimestamp();

  Message findOneById(long id);

  List<Message> findAllByTimestampAndUsername(Timestamp timestamp, String username);
}
