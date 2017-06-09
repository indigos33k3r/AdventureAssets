/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.adventureassets.traps;

import org.terasology.entitySystem.Component;
import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.prefab.Prefab;
import org.terasology.network.FieldReplicateType;
import org.terasology.network.Replicate;
import org.terasology.world.block.ForceBlockActive;

/**
 * Makes a trap placeholder block a trap placeholder block.
 */
@ForceBlockActive // Force block active so that entity remains during interaction
public class TrapPlaceholderComponent implements Component {
    @Replicate(FieldReplicateType.SERVER_TO_CLIENT)
    private Prefab selectedPrefab;
    private EntityRef trapEntity;

    public Prefab getSelectedPrefab() {
        return selectedPrefab;
    }

    public void setSelectedPrefab(Prefab selectedPrefab) {
        this.selectedPrefab = selectedPrefab;
    }

    public EntityRef getTrapEntity() {
        return trapEntity;
    }

    public void setTrapEntity(EntityRef trapEntity) {
        this.trapEntity = trapEntity;
    }
}