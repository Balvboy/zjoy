package zjoy.research.generic;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGeneric {

	public Map<String, String> list = new HashMap<String, String>(); 

	public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException 
	{ 
		Field c = TestGeneric.class.getField("list"); 
		Field f = Field.class.getDeclaredField("signature"); 
		f.setAccessible(true); 
		System.out.println(((String) f.get(c))); 

	} 
	
	
	
	public void test(List<Object> list){
		
		for(Object obj : list){
			String str = (String)obj;
		}
	}
	
	private static Class getClass(Type type, int i) {     
        if (type instanceof ParameterizedType) { // 处理泛型类型     
            return getGenericClass((ParameterizedType) type, i);     
        } else if (type instanceof TypeVariable) {     
            return (Class) getClass(((TypeVariable) type).getBounds()[0], 0); // 处理泛型擦拭对象     
        } else {// class本身也是type，强制转型     
            return (Class) type;     
        }     
    }     
    
    private static Class getGenericClass(ParameterizedType parameterizedType, int i) {     
        Object genericClass = parameterizedType.getActualTypeArguments()[i];     
        if (genericClass instanceof ParameterizedType) { // 处理多级泛型     
            return (Class) ((ParameterizedType) genericClass).getRawType();     
        } else if (genericClass instanceof GenericArrayType) { // 处理数组泛型     
            return (Class) ((GenericArrayType) genericClass).getGenericComponentType();     
        } else if (genericClass instanceof TypeVariable) { // 处理泛型擦拭对象     
            return (Class) getClass(((TypeVariable) genericClass).getBounds()[0], 0);     
        } else {     
            return (Class) genericClass;     
        }     
    }  
    
    
    private static void classGeneric() {     
        System.out.println("\n--------------------- classGeneric ---------------------");     
//        TestGeneric gc = new TestGeneric();
//        List<String> gc = new ArrayList<String>();
        Map<String,String> gc = new HashMap<String,String>();
        Type[] gis = gc.getClass().getGenericInterfaces(); // 接口的泛型信息     
        Type gps = gc.getClass().getGenericSuperclass(); // 父类的泛型信息     
        TypeVariable[] gtr = gc.getClass().getTypeParameters(); // 当前接口的参数信息     
        System.out.println("============== getGenericInterfaces");     
        for (Type t : gis) {     
            System.out.println(t + " : " + getClass(t, 0));     
        }     
        System.out.println("============== getGenericSuperclass");     
        System.out.println(getClass(gps, 0));     
        System.out.println("============== getTypeParameters");     
        for (TypeVariable t : gtr) {     
            StringBuilder stb = new StringBuilder();     
            for (Type tp : t.getBounds()) {     
                stb.append(tp + " : ");     
            }     
    
            System.out.println(t + " : " + t.getName() + " : " + stb);     
        }     
    
    }

}
