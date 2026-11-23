package com.pokedaisy.app.companion.data

/** German Crystal's (Kristall's) names over English Crystal's tables (scripts/gen_gen2_tables.py crystal_de). */
internal val CRYSTAL_DE_TEXT by lazy {
    GameText(
        species = { speciesNamesCrystalDe }, moves = { moveNamesCrystalDe }, items = { itemNamesCrystalDe }, natures = emptyList(),
        mapSecs = { landmarkNamesCrystalDe }, smallFontWidths = { IntArray(0) }, englishMapSecs = { mapSecDataCrystal },
        englishMoves = { moveDataCrystal },
    )
}

internal val CRYSTAL_ES_TEXT by lazy {
    GameText(
        species = { speciesNamesCrystalEs }, moves = { moveNamesCrystalEs }, items = { itemNamesCrystalEs }, natures = emptyList(),
        mapSecs = { landmarkNamesCrystalEs }, smallFontWidths = { IntArray(0) }, englishMapSecs = { mapSecDataCrystal },
        englishMoves = { moveDataCrystal },
    )
}
