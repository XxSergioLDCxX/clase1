<?php
class Parque {
    private $sectores;
    private $animales;
    
    public function __construct($numSectores) {
        $this->sectores = array_fill(0, $numSectores, null);
        $this->animales = [];
    }

    public function agregarAnimal(Animal $animal) {
        // Buscar un sector libre y colocar al animal en él
        $posicionLibre = array_search(null, $this->sectores);
        if ($posicionLibre !== false) {
            $this->sectores[$posicionLibre] = $animal;
            $animal->setPosicion($posicionLibre);
            $this->animales[] = $animal;
            echo "{$animal->getNombre()} se ha unido al parque en el sector $posicionLibre.\n";
        } else {
            echo "{$animal->getNombre()} no pudo entrar al parque porque no hay sectores libres.\n";
        }
    }

    public function moverAnimales() {
        foreach ($this->animales as $animal) {
            $posicionActual = $animal->getPosicion();
            if ($posicionActual === null) {
                continue; // Si el animal ya se fue, saltar al siguiente
            }

            $nuevaPosicion = $posicionActual;
            while ($nuevaPosicion === $posicionActual) {
                // Intentar moverse a una posición adyacente al azar
                $nuevaPosicion = $posicionActual + rand(-1, 1);
                if ($nuevaPosicion < 0 || $nuevaPosicion >= count($this->sectores)) {
                    $nuevaPosicion = $posicionActual; // No puede salir del parque
                }
            }

            // Mover al animal a la nueva posición
            $this->sectores[$posicionActual] = null;
            $this->sectores[$nuevaPosicion] = $animal;
            $animal->setPosicion($nuevaPosicion);

            echo "{$animal->getNombre()} se ha movido del sector $posicionActual al sector $nuevaPosicion.\n";
        }
    }

    public function hacerAcciones() {
        foreach ($this->animales as $animal) {
            if (rand(1, 3) == 1) {
                $animal->comer();
            } elseif (rand(1, 3) == 2) {
                $animal->dormir();
            } else {
                $animal->hacerRuido();
            }
        }
    }

    public function abandonarAnimales() {
        foreach ($this->animales as $key => $animal) {
            if (rand(1, 2) == 1) {
                $posicion = $animal->getPosicion();
                echo "{$animal->getNombre()} ha abandonado el parque desde el sector $posicion.\n";
                $this->sectores[$posicion] = null;
                unset($this->animales[$key]);
            }
        }
        $this->animales = array_values($this->animales); // Reindexar el array después de eliminar animales
    }
}