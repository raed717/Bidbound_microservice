import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.Enchere;

@RestController
    public class EnchereController {

        private final EnchereService enchereService;

        @Autowired
        public EnchereController(EnchereService enchereService) {
            this.enchereService = enchereService;
        }

        @PostMapping
        public Enchere createEnchere(@RequestBody Enchere enchere) {
            return enchereService.createEnchere(enchere);
        }

        @GetMapping("/{id}")
        public Enchere getEnchereById(@PathVariable Long id) {
            return enchereService.getEnchereById(id);
        }

        @PutMapping("/{id}")
        public Enchere updateEnchere(@PathVariable Long id, @RequestBody Enchere enchere) {
            enchere.setId(id);
            return enchereService.updateEnchere(enchere);
        }

        @DeleteMapping("/{id}")
        public void deleteEnchere(@PathVariable Long id) {
            enchereService.deleteEnchere(id);
        }
}




