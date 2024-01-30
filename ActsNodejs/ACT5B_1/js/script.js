document.addEventListener('DOMContentLoaded', () => {
    // Países
    fetch('/paises')
        .then(response => response.json())
        .then(data => {
            const selectPaises = document.getElementById('selectPaises');
            data.forEach(pais => {
                const option = document.createElement('option');
                option.value = pais.id;
                option.text = pais.pais;
                selectPaises.appendChild(option);
            });
        })
        .catch(error => console.error('Error al obtener países:', error));
    // Estados
    fetch('/estados')
        .then(response => response.json())
        .then(data => {
            const selectEstados = document.getElementById('selectEstados');
            data.forEach(estado => {
                const option = document.createElement('option');
                option.value = estado.id;
                option.text = estado.estado;
                selectEstados.appendChild(option);
            });
        })
        .catch(error => console.error('Error al obtener estados:', error));
    // Municipios
    fetch('/municipios')
        .then(response => response.json())
        .then(data => {
            const selectMunicipio = document.getElementById('selectMunicipio');
            data.forEach(municipio => {
                const option = document.createElement('option');
                option.value = municipio.id;
                option.text = municipio.municipio;
                selectMunicipio.appendChild(option);
            });
        })
        .catch(error => console.error('Error al obtener municipios:', error));
});
