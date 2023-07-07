package org.apache.fineract.cn.reporting.internal.repository;

import org.apache.fineract.cn.reporting.api.domain.ResponseBankDeatils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetailsEntity, BigInteger> {

    @Query(nativeQuery = true, value="select bank_id,bank_name from reports.tbl_summary_banks  " +
            "where geographical_flag=?1 and year_month='2023-05' and state_id=?2 and bank_id is not null  " +
            "group by bank_id,bank_name")
    List<Object[]> fetchBankList(Integer geographicalFlag, Integer stateId);
}
