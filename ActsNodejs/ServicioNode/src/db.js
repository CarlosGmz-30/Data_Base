import { createPool } from "mysql2/promise";

// Creamos la conexión a la base de datos
export const pool = createPool({
    host: 'localhost',
    user: 'root',
    password: 'root',
    port: 3306,
    database: 'companydb'
})