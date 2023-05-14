package data.mapper

import data.cache.entity.CountryEntity
import domain.mapper.base.Mapper
import domain.model.CountryModel

class CountryEntityToModelMapper : Mapper<CountryEntity, CountryModel> {

    override fun map(source: CountryEntity): CountryModel =
        CountryModel(
            name = source.name,
            imageUrl = source.imageUrl,
            _isFavorite = source.isFavorite,
        )

    companion object {
        const val NAMED = "CountryEntityToModelMapper"
    }
}