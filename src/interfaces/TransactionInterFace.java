package interfaces;

import classes.Transaction;

public interface TransactionInterFace {
    public void insertTransaction(Transaction transaction) ;
    public Transaction getTransaction(int id);
    public void showAllTransaction();
    public void removeTransaction(Transaction transaction);
}
