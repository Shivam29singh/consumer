package com.PODownload.Consumer.service;

import com.PODownload.Consumer.controller.POInfoResource;
import com.PODownload.Consumer.model.POInfo;
import com.PODownload.Consumer.repository.POInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MessageListener {


   public  POInfoRepo poInfoRepo = new POInfoRepo() {
        @Override
        public List<POInfo> findAll() {
            return null;
        }

        @Override
        public List<POInfo> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<POInfo> findAllById(Iterable<Long> iterable) {
            return null;
        }

        @Override
        public <S extends POInfo> List<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends POInfo> S saveAndFlush(S s) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<POInfo> iterable) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public POInfo getOne(Long aLong) {
            return null;
        }

        @Override
        public <S extends POInfo> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends POInfo> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<POInfo> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends POInfo> S save(S s) {
            return null;
        }

        @Override
        public Optional<POInfo> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(POInfo poInfo) {

        }

        @Override
        public void deleteAll(Iterable<? extends POInfo> iterable) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends POInfo> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends POInfo> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends POInfo> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends POInfo> boolean exists(Example<S> example) {
            return false;
        }
    };
    @StreamListener(Processor.INPUT)
    public void consumerMessage(POInfo poinfo) {

        System.out.println("Message received from Kafka channel");
        System.out.println(poinfo);
        poInfoRepo.save(poinfo);
    }
}
