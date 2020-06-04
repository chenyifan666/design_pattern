package com.pattern.abstract_factory;

public class DatabaseUtil {
    private static String database="oracle";

    public static IUser createUser(){
        switch (database){
            case "mysql":
                return new UserMySqlOperator();
            case "oracle":
                return new UserOracleOperator();
        }
        return null;
    }
}
