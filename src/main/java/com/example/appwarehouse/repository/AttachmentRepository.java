package com.example.appwarehouse.repository;

import com.example.appwarehouse.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment")
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

}