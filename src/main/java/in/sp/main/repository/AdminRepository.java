package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.sp.main.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}