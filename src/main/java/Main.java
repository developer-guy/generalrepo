import org.apache.commons.jexl2.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Batuhan on 4.5.2016.
 */
public class Main {

    private static JexlEngine jexlEngine = new JexlEngine();

    private static UnifiedJEXL unifiedJEXL = new UnifiedJEXL(jexlEngine);

    public static void main(String[] args) {

        String expression = "Hello , ${SOME_VAR}!\nMy name is ${person.name}.I live in ${person.address.city}-${person.address.building}.";

        expression =  "${person.age>=21?'Person is adult':'you are minor'}";

        JexlContext jexlContext = new MapContext();
        jexlContext.set("SOME_VAR","Batuhan Apaydın");

        Adress adress = new Adress("Sancaktepe","Gedizler");
        Person person = new Person("412412421","Batuhan",adress,22);
        jexlContext.set("person",person);

        Object value = unifiedJEXL.parse(expression).evaluate(jexlContext);

        System.out.println(value);


       /* List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");


        JexlContext jexlContext = new MapContext();
        jexlContext.set("list", list);;

        Map<String, Object> functions1 = new HashMap<String, Object>();
        functions1.put("system", System.out);


        JexlEngine jexl = new JexlEngine();
        jexl.setFunctions(functions1);
        Expression expression = jexl.createExpression("for(item : list) { system:println(item) }");


        expression.evaluate(jexlContext);*/

    }
}
