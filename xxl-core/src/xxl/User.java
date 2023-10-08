package xxl;

public class User {
    private String _name = "root";

    public User(String name) {
        _name = name;
    }

    /**
     * returns name of user
     * 
     * @return name
     */
    public String getName() {
        return _name;
    }

    /**
     * sets name of user
     * 
     * @param name
     */
    public void setName(String name) {
        _name = name;
    }

    /**
     * compares two users
     * 
     * @param user
     * @return true if users are the same
     */
    @Override
    public boolean equals(Object user) {
        if (user instanceof User) {
            return this.getName().equals(((User) user).getName());
        }
        return false;
    }


}