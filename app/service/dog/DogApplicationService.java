package service.dog;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.PostgreSQLTemplates;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import domain.QDog;
import models.Dog;
import play.db.DB;

import java.util.Arrays;
import java.util.List;

public class DogApplicationService {

    private final static QDog Q_DOG = QDog.dog;


    public static List<Dog> getDogs() {
        return Arrays.asList(
                new Dog(1, "Fahra", 8, true),
                new Dog(2, "Rocky", 2, false),
                new Dog(3, "Zouma", 4, true)
        );
    }

    public static Dog getDog() {

        SQLTemplates templates = new PostgreSQLTemplates();
        Configuration configuration = new Configuration(templates);
        SQLQueryFactory queryFactory = new SQLQueryFactory(configuration, DB.getDataSource());
        return queryFactory.select(dogProjection()).from(Q_DOG).fetchOne();
    }

    private static ConstructorExpression<Dog> dogProjection() {
        return Projections.constructor(Dog.class, Q_DOG.all());
    }

    public static Dog getOtherDog() {
        Dog dog = new Dog();

        return dog;
    }
}
