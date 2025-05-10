package app.builder2;

public class User {
    private String username;
    private int age;
    private String gender;


    private User(Builder builder) {
        this.username = builder.username;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    //Setters
    public void setUsername(String username) {
        this.username = username;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    //Getters
    public String getUsername() {
        return username;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }


    public static class Builder {

        private String username;
        private int age;
        private String gender;

        public Builder username(String username) {
            this.username = username;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public User build() {
            //conditii

            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Age: " + age + ", Gender: " + gender;
    }

}
