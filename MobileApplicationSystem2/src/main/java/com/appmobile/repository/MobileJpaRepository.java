package com.appmobile.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.appmobile.model.Mobile;
public interface MobileJpaRepository extends JpaRepository<Mobile,Integer>
{
   
}
