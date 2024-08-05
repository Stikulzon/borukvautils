BorukvaUtils is a common library for polymer-based mods.

Adds 4 interfaces - PlantBased, SlabBased, TripwireBased and FlatTripwireBased with waterloggable variants, which return a transparent block for PolymerBlockState. It is important to use the same transparent models in mods, so as not to reserve more than necessary.

Reserves one of plant, kelp, slab, tripwire and flat tripwire BlockModels accordingly.

## Usage:
Add it to your dependencies like this:

```
repositories {
	maven { url "https://api.modrinth.com/maven/" }
}

dependencies {
	modImplementation "maven.modrinth:borukvautils:0.1.1"
}
```
