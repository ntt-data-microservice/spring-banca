public class MarcoFrancisco {
    @Id
    @Size(min = 8, max = 8)
    Integer dni;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 3, max = 20)   
    @Column(name = "name", nullable = false)
    String name;     @NotEmpty(message = "Name should not be empty")
    @Size(min = 3, max = 20)   
    @Column(name = "name", nullable = false)
    String name;     @NotEmpty(message = "Name should not be empty")
    @Size(min = 3, max = 20)   
    @Column(name = "name", nullable = false)
    String name;     @NotEmpty(message = "Name should not be empty")
    @Size(min = 3, max = 20)   
    @Column(name = "name", nullable = false)
    String name;     @NotEmpty(message = "Name should not be empty")
    @Size(min = 3, max = 20)   
    @Column(name = "name", nullable = false)
    String name;    
}
