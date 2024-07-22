package assignmet5week_정답아님.firstDay;

import supercoding.fifthweek.meta3.Repeat;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class SingletonContext {

    private static SingletonConfig config;
    private static Map<String, Method> singletonMap = new HashMap<>();
    private static Map<String, Object> singletonObjectMap = new HashMap<>();

    public static void setConfig(SingletonConfig config) {
        SingletonContext.config = config;
    }

    static synchronized Object getSingleton(String name) {
        //TODO: 아래 구문 삭제 후, Map을 이용한 Singleton 생성 로직 구현 필요합니다.

        // 이미 존재하는 인스턴스가 있는지 확인
        if(singletonObjectMap.containsKey(name)) {
            return singletonObjectMap.get(name);
        }

        // 인스턴스가 없으면 새로 생성
        if (singletonMap.containsKey(name)) {
            try {
                Method singletonMethod = singletonMap.get(name);
                Object singletonInstance = singletonMethod.invoke(config);
                singletonObjectMap.put(name, singletonInstance);
                return singletonInstance;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // 생성할 수 없으면 null 반환
        return null;
    }

    public static void executeMethodsBySingletonAnnotation(Object object) {
        // TODO - 1: Object 가 들어 오면 해당 클래스의 Method를 돌면서, @Singleton annotation을 발견합니다.
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        // TODO - 2: 해당 Annotation의 name 과 method를 적당한 Map에 저장합니다.
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Singleton) {
                    Singleton singletonAnnotation = (Singleton) annotation;
                    String singletonName = singletonAnnotation.name();

                    // 싱글톤 인스턴스를 생성하는 메소드를 등록
                    singletonMap.put(singletonName, method);

                    // 메소드를 통해 싱글톤 인스턴스 생성 및 저장
                    try {
                        Object singletonInstance = method.invoke(object);
                        singletonObjectMap.put(singletonName, singletonInstance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
