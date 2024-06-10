package FinalExam.SuperMarket.Config;

import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
//@EnableFirebase
@Configuration
public class FirebaseConfig {
   /* 
    @Autowired
    private FirebaseApp firebaseApp;

    @Autowired
    private FirebaseFirestore firestore;

    public static void main(String[] args) {
        SpringApplication.run(FirebaseDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return args -> {
            // Leer un documento de Firestore
            DocumentReference docRef = firestore.document("users/alice");
            DocumentSnapshot document = docRef.get().getResult();
            if (document.exists()) {
                Map<String, Object> data = document.getData();
                System.out.println("Nombre: " + data.get("name"));
                System.out.println("Email: " + data.get("email"));
            } else {
                System.out.println("El documento no existe.");
            }

            // Escribir un documento en Firestore
            Map<String, Object> userData = new HashMap<>();
            userData.put("name", "Bob");
            userData.put("email", "bob@example.com");
            firestore.collection("users").document("bob").set(userData);
            System.out.println("Documento escrito correctamente.");
        };
    }*/ 
}
