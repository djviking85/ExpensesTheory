package pro.sky.Expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.Expenses.model.Expense;
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
