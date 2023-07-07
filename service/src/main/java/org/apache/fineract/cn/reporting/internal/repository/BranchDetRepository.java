package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface BranchDetRepository extends JpaRepository<BranchDetEntity, BigInteger> {
    @Query(nativeQuery = true, value="select branch_id,branch_name from reports.tbl_summary_banks " +
            " where geographical_flag=?1 and year_month='2023-05' and state_id=?2   and bank_id = ?3" +
            " group by branch_id,branch_name")
    List<Object[]> fetchBranchList(
            @Param("geographicalFlag") final Integer geographicalFlag,
            @Param("stateId") final Integer stateId,
            @Param("bankId") final Integer bankId
    );
}
