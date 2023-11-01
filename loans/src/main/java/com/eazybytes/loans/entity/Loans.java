package com.eazybytes.loans.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class Loans extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    @Column(name="loan_id")
    private Long loanId;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="loan_number")
    private String loanNumber;

    @Column(name="loan_type")
    private String loanType;

    @Column(name="total_loan")
    private int totalLoan;

    @Column(name="amount_paid")
    private int amountPaid;

    @Column(name="outstanding_amount")
    private int outstandingAmount;
}
