<?php
$libro = new Libro("L001", "El Gran Gatsby", "F. Scott Fitzgerald", "Editorial XYZ");
$revista = new Revista("R001", "National Geographic", 123, 2023);
$dvd = new DVD("D001", "Titanic", "James Cameron", 1997, "Película");

echo "Información del libro:\n";
echo "Número de identificación: " . $libro->getNumeroIdentificacion() . "\n";
echo "Título: " . $libro->getTitulo() . "\n";
echo "Autor: " . $libro->getAutor() . "\n";
echo "Editorial: " . $libro->getEditorial() . "\n";

echo "\nInformación de la revista:\n";
echo "Número de identificación: " . $revista->getNumeroIdentificacion() . "\n";
echo "Título: " . $revista->getTitulo() . "\n";
echo "Número de revista: " . $revista->getNumeroRevista() . "\n";
echo "Año de publicación: " . $revista->getAnioPublicacion() . "\n";

echo "\nInformación del DVD:\n";
echo "Número de identificación: " . $dvd->getNumeroIdentificacion() . "\n";
echo "Título: " . $dvd->getTitulo() . "\n";
echo "Director: " . $dvd->getDirector() . "\n";
echo "Año: " . $dvd->getAnio() . "\n";
echo "Tipo: " . $dvd->getTipo() . "\n";