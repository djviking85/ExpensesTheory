package pro.sky.Expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pro.sky.Expenses.model.Expense;
import pro.sky.Expenses.model.ExpenseByCategory;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
    @Query(value = "SELECT category, SUM (amount) as amount from expenses GROUP BY category", nativeQuery = true)
    List<ExpenseByCategory> getExpenseByCategory();
}
