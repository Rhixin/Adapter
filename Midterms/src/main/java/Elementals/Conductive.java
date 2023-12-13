package Elementals;

// Place all interfaces here
interface Conductive {
    double percent_conductive();
}

interface Magnetize{
    int magnetic_strength();
    int magnetic_type();
}

interface Radioactive{
    int half_life();
}
