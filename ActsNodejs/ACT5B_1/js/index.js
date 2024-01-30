const express = require('express');
const mysql = require('mysql');

const app = express();
const port = 3000;

// Configuración de la conexión a la base de datos
const db = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'nodeApi'
});

// Conexión a la base de datos
db.connect((err) => {
    if (err) {
        console.error('Error al conectar a la base de datos:', err);
        process.exit;
    } else {
        console.log('Conexión exitosa a la base de datos');
    }
});

// Inicia el servidor
app.listen(port, () => {
    console.log(`Servidor escuchando en http://localhost:${port}`);
});


// Ruta para obtener los países
app.get('/paises', (req, res) => {
    const query = 'SELECT * FROM paises';
    db.query(query, (err, result) => {
        if (err) {
            console.error('Error al obtener países:', err);
            res.status(500).send('Error interno del servidor');
        } else {
            res.json(result);
        }
    });
});

// Ruta para obtener los estados
app.get('/estados', (req, res) => {
    const query = 'SELECT * FROM estados';
    db.query(query, (err, result) => {
        if (err) {
            console.error('Error al obtener estados:', err);
            res.status(500).send('Error interno del servidor');
        } else {
            res.json(result);
        }
    });
});

// Ruta para obtener los municipios
app.get('/municipios', (req, res) => {
    const query = 'SELECT * FROM municipios';
    db.query(query, (err, result) => {
        if (err) {
            console.error('Error al obtener municipios:', err);
            res.status(500).send('Error interno del servidor');
        } else {
            res.json(result);
        }
    });
});