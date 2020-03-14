package my.patterns.builder;

public class Account {
    private String firstName;
    private String lastName;
    private String username;
    private Double money;
    private Boolean isBlocked;

    private Account(AccountBuilder accountBuilder) {
        this.firstName = accountBuilder.firstName;
        this.lastName = accountBuilder.lastName;
        this.username = accountBuilder.username;
        this.money = accountBuilder.money;
        this.isBlocked = accountBuilder.isBlocked;
    }
    public static class AccountBuilder{
        private String firstName;
        private String lastName;
        private String username;
        private Double money;
        private Boolean isBlocked;

        public AccountBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public AccountBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public AccountBuilder setMoney(Double money) {
            this.money = money;
            return this;
        }

        public AccountBuilder setBlocked(Boolean blocked) {
            isBlocked = blocked;
            return this;
        }
        public Account build(){
            return new Account(this);
        }
    }
}
