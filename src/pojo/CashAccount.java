package pojo;

import java.math.BigDecimal;

public class CashAccount extends TradeAccount {
  private BigDecimal cashBalance;

  public BigDecimal getCashBalance() {
    return this.cashBalance;
  }

  public void setCashBalance(BigDecimal cashBalance) {
    this.cashBalance = cashBalance;
  }

}
