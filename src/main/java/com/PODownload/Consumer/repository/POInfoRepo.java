package com.PODownload.Consumer.repository;

import com.PODownload.Consumer.model.POInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository

public interface POInfoRepo extends JpaRepository<POInfo, Long>{

//         POInfo findByPOInfoPoNumber(long number);

}
